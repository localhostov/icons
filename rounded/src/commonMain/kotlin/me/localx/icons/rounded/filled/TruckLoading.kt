package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.TruckLoading: ImageVector
    get() {
        if (_truckLoading != null) {
            return _truckLoading!!
        }
        _truckLoading = Builder(name = "TruckLoading", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.474f, 17.0f)
                arcToRelative(3.541f, 3.541f, 0.0f, false, false, -0.475f, 0.032f)
                verticalLineTo(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineTo(16.279f)
                lineToRelative(-2.734f, 0.912f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.156f, -1.0f)
                lineToRelative(-1.553f, -5.1f)
                arcTo(3.007f, 3.007f, 0.0f, false, false, 9.788f, 9.142f)
                lineToRelative(-6.7f, 2.13f)
                arcTo(3.013f, 3.013f, 0.0f, false, false, 1.129f, 15.0f)
                lineToRelative(1.634f, 5.373f)
                arcToRelative(2.966f, 2.966f, 0.0f, false, false, 0.457f, 0.831f)
                lineToRelative(-2.536f, 0.845f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.632f, 1.9f)
                lineToRelative(16.267f, -5.422f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 20.474f, 17.0f)
                close()
                moveTo(8.888f, 13.65f)
                lineToRelative(-2.465f, 0.784f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.606f, -1.906f)
                lineToRelative(2.465f, -0.784f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.606f, 1.906f)
                close()
            }
        }
        .build()
        return _truckLoading!!
    }

private var _truckLoading: ImageVector? = null

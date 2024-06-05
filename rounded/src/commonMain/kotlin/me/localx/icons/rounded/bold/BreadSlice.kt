package me.localx.icons.rounded.bold

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

public val Icons.Bold.BreadSlice: ImageVector
    get() {
        if (_breadSlice != null) {
            return _breadSlice!!
        }
        _breadSlice = Builder(name = "BreadSlice", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 11.5f)
                close()
                moveTo(13.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 15.0f)
                close()
                moveTo(8.5f, 15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 15.0f)
                close()
                moveTo(22.0f, 17.506f)
                lineTo(22.0f, 10.354f)
                arcToRelative(5.258f, 5.258f, 0.0f, false, false, 1.847f, -5.33f)
                horizontalLineToRelative(0.0f)
                arcTo(5.378f, 5.378f, 0.0f, false, false, 18.541f, 1.0f)
                lineTo(5.459f, 1.0f)
                arcTo(5.378f, 5.378f, 0.0f, false, false, 0.153f, 5.024f)
                arcTo(5.258f, 5.258f, 0.0f, false, false, 2.0f, 10.354f)
                verticalLineToRelative(7.152f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 7.5f, 23.0f)
                lineTo(16.5f, 23.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 22.0f, 17.506f)
                close()
                moveTo(18.541f, 4.0f)
                arcToRelative(2.422f, 2.422f, 0.0f, false, true, 2.392f, 1.733f)
                arcToRelative(2.347f, 2.347f, 0.0f, false, true, -1.188f, 2.543f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 9.573f)
                verticalLineToRelative(7.933f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.5f, 20.0f)
                lineTo(7.5f, 20.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.0f, 17.506f)
                lineTo(5.0f, 9.573f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.745f, -1.3f)
                arcTo(2.347f, 2.347f, 0.0f, false, true, 3.067f, 5.734f)
                arcTo(2.421f, 2.421f, 0.0f, false, true, 5.459f, 4.0f)
                close()
            }
        }
        .build()
        return _breadSlice!!
    }

private var _breadSlice: ImageVector? = null

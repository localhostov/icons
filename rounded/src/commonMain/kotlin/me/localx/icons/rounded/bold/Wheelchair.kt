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

public val Icons.Bold.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.5f, 3.0f)
                close()
                moveTo(22.5f, 20.0f)
                horizontalLineToRelative(-0.984f)
                lineTo(20.4f, 17.2f)
                arcToRelative(3.485f, 3.485f, 0.0f, false, false, -3.25f, -2.2f)
                lineTo(13.5f, 15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(13.0f, 13.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(13.0f, 10.0f)
                lineTo(13.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -3.0f, 0.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 2.613f, 3.372f)
                arcToRelative(4.99f, 4.99f, 0.0f, true, true, -5.768f, -6.738f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.69f, -2.92f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 15.742f, 18.0f)
                horizontalLineToRelative(1.4f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.464f, 0.313f)
                lineToRelative(1.5f, 3.744f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 23.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null

package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.SkiLift: ImageVector
    get() {
        if (_skiLift != null) {
            return _skiLift!!
        }
        _skiLift = Builder(name = "SkiLift", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.7f, 13.135f)
                arcToRelative(4.471f, 4.471f, 0.0f, false, true, -2.372f, 2.5f)
                lineToRelative(-18.8f, 8.459f)
                lineTo(1.3f, 21.356f)
                lineTo(13.934f, 15.67f)
                lineToRelative(-0.977f, -2.03f)
                lineToRelative(-2.742f, 1.184f)
                arcToRelative(2.606f, 2.606f, 0.0f, false, true, -3.27f, -1.259f)
                lineTo(5.273f, 9.772f)
                arcToRelative(2.628f, 2.628f, 0.0f, false, true, 4.7f, -2.352f)
                lineToRelative(1.572f, 3.615f)
                lineTo(14.41f, 9.744f)
                lineToRelative(2.261f, 4.7f)
                lineTo(20.1f, 12.9f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.766f, -1.983f)
                lineToRelative(2.74f, -1.22f)
                arcTo(4.465f, 4.465f, 0.0f, false, true, 23.7f, 13.135f)
                close()
                moveTo(2.294f, 15.372f)
                arcTo(7.478f, 7.478f, 0.0f, false, false, 5.2f, 18.417f)
                lineToRelative(1.5f, -2.6f)
                arcToRelative(4.469f, 4.469f, 0.0f, false, true, -1.719f, -1.772f)
                lineTo(2.761f, 8.711f)
                lineTo(-0.011f, 9.861f)
                close()
                moveTo(16.0f, 0.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(5.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 3.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 5.0f)
                close()
            }
        }
        .build()
        return _skiLift!!
    }

private var _skiLift: ImageVector? = null

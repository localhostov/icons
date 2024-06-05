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

public val Icons.Bold.Custard: ImageVector
    get() {
        if (_custard != null) {
            return _custard!!
        }
        _custard = Builder(name = "Custard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 18.5f)
                curveToRelative(0.0f, -0.8f, -0.628f, -1.455f, -1.417f, -1.498f)
                lineToRelative(-1.949f, -11.045f)
                curveToRelative(-0.508f, -2.872f, -2.993f, -4.957f, -5.909f, -4.957f)
                horizontalLineToRelative(-5.449f)
                curveToRelative(-2.917f, 0.0f, -5.402f, 2.085f, -5.909f, 4.957f)
                lineToRelative(-1.949f, 11.045f)
                curveToRelative(-0.79f, 0.043f, -1.418f, 0.697f, -1.418f, 1.498f)
                curveToRelative(0.0f, 0.677f, 0.449f, 1.249f, 1.065f, 1.436f)
                curveToRelative(0.01f, 0.033f, 0.021f, 0.066f, 0.033f, 0.098f)
                curveToRelative(0.258f, 1.677f, 1.711f, 2.966f, 3.459f, 2.966f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.794f, 0.0f, 3.277f, -1.357f, 3.477f, -3.098f)
                curveToRelative(0.564f, -0.215f, 0.966f, -0.762f, 0.966f, -1.402f)
                close()
                moveTo(5.876f, 9.0f)
                horizontalLineToRelative(1.124f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.124f)
                lineToRelative(1.412f, 8.0f)
                lineTo(4.464f, 17.0f)
                lineToRelative(1.412f, -8.0f)
                close()
                moveTo(9.276f, 4.0f)
                horizontalLineToRelative(5.449f)
                curveToRelative(1.29f, 0.0f, 2.412f, 0.816f, 2.828f, 2.0f)
                horizontalLineToRelative(-0.553f)
                curveToRelative(-0.945f, 0.0f, -1.814f, 0.329f, -2.5f, 0.88f)
                curveToRelative(-0.686f, -0.551f, -1.555f, -0.88f, -2.5f, -0.88f)
                reflectiveCurveToRelative(-1.815f, 0.329f, -2.5f, 0.88f)
                curveToRelative(-0.685f, -0.551f, -1.555f, -0.88f, -2.5f, -0.88f)
                horizontalLineToRelative(-0.553f)
                curveToRelative(0.417f, -1.184f, 1.538f, -2.0f, 2.829f, -2.0f)
                close()
            }
        }
        .build()
        return _custard!!
    }

private var _custard: ImageVector? = null

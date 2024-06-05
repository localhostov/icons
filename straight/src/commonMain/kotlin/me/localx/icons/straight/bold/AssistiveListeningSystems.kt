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

public val Icons.Bold.AssistiveListeningSystems: ImageVector
    get() {
        if (_assistiveListeningSystems != null) {
            return _assistiveListeningSystems!!
        }
        _assistiveListeningSystems = Builder(name = "AssistiveListeningSystems", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 22.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(8.5f, 14.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1.439f, 17.561f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(2.121f, -2.121f)
                lineTo(3.561f, 15.439f)
                lineToRelative(-2.121f, 2.121f)
                close()
                moveTo(19.099f, 0.125f)
                lineToRelative(-1.197f, 2.75f)
                curveToRelative(1.438f, 0.626f, 2.577f, 1.762f, 3.209f, 3.198f)
                lineToRelative(2.746f, -1.207f)
                curveToRelative(-0.936f, -2.13f, -2.625f, -3.813f, -4.758f, -4.741f)
                close()
                moveTo(15.237f, 12.999f)
                curveToRelative(0.492f, -0.551f, 0.763f, -1.261f, 0.763f, -1.999f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(2.237f, 1.999f)
                close()
                moveTo(12.882f, 3.001f)
                curveToRelative(-4.42f, 0.064f, -7.882f, 3.578f, -7.882f, 7.999f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -2.764f, 2.164f, -4.959f, 4.925f, -4.999f)
                curveToRelative(1.341f, -0.059f, 2.624f, 0.491f, 3.584f, 1.438f)
                reflectiveCurveToRelative(1.49f, 2.212f, 1.49f, 3.561f)
                curveToRelative(0.0f, 1.001f, -0.296f, 1.965f, -0.856f, 2.791f)
                curveToRelative(-0.77f, 1.134f, -1.144f, 2.347f, -1.144f, 3.709f)
                curveToRelative(0.0f, 2.298f, -2.012f, 3.5f, -4.0f, 3.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(3.991f, 0.0f, 7.0f, -2.794f, 7.0f, -6.5f)
                curveToRelative(0.0f, -0.763f, 0.193f, -1.387f, 0.625f, -2.024f)
                curveToRelative(0.899f, -1.324f, 1.375f, -2.872f, 1.375f, -4.476f)
                curveToRelative(0.0f, -2.158f, -0.847f, -4.182f, -2.384f, -5.697f)
                reflectiveCurveToRelative(-3.593f, -2.302f, -5.734f, -2.302f)
                close()
            }
        }
        .build()
        return _assistiveListeningSystems!!
    }

private var _assistiveListeningSystems: ImageVector? = null

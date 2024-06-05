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

public val Icons.Bold.Angle90: ImageVector
    get() {
        if (_angle90 != null) {
            return _angle90!!
        }
        _angle90 = Builder(name = "Angle90", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.954f, 7.493f)
                lineToRelative(1.439f, -2.65f)
                curveToRelative(1.887f, 1.256f, 3.509f, 2.878f, 4.765f, 4.765f)
                lineToRelative(-2.65f, 1.439f)
                curveToRelative(-0.962f, -1.387f, -2.166f, -2.592f, -3.554f, -3.554f)
                close()
                moveTo(11.757f, 3.409f)
                curveToRelative(-2.073f, -0.902f, -4.356f, -1.409f, -6.757f, -1.409f)
                verticalLineToRelative(3.0f)
                curveToRelative(1.883f, 0.0f, 3.678f, 0.379f, 5.32f, 1.056f)
                lineToRelative(1.437f, -2.648f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.0f, -2.401f, -0.507f, -4.684f, -1.409f, -6.757f)
                lineToRelative(-2.648f, 1.437f)
                curveToRelative(0.677f, 1.642f, 1.056f, 3.436f, 1.056f, 5.32f)
                close()
                moveTo(3.5f, 21.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                lineTo(3.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(20.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(20.5f)
                verticalLineToRelative(-3.0f)
                lineTo(3.5f, 21.0f)
                close()
            }
        }
        .build()
        return _angle90!!
    }

private var _angle90: ImageVector? = null

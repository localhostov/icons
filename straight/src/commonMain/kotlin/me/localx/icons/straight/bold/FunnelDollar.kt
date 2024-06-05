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

public val Icons.Bold.FunnelDollar: ImageVector
    get() {
        if (_funnelDollar != null) {
            return _funnelDollar!!
        }
        _funnelDollar = Builder(name = "FunnelDollar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 9.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.275f, 0.225f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                curveToRelative(0.0f, -0.294f, -0.177f, -0.555f, -0.449f, -0.664f)
                lineToRelative(-2.216f, -0.887f)
                curveToRelative(-1.418f, -0.566f, -2.335f, -1.921f, -2.335f, -3.449f)
                curveToRelative(0.0f, -1.582f, 1.056f, -2.923f, 2.5f, -3.354f)
                lineTo(10.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.5f, 1.146f)
                curveToRelative(1.444f, 0.431f, 2.5f, 1.772f, 2.5f, 3.354f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.275f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.225f, -0.5f, 0.5f)
                curveToRelative(0.0f, 0.294f, 0.177f, 0.555f, 0.449f, 0.664f)
                lineToRelative(2.216f, 0.887f)
                curveToRelative(1.418f, 0.566f, 2.335f, 1.921f, 2.335f, 3.449f)
                curveToRelative(0.0f, 1.582f, -1.056f, 2.923f, -2.5f, 3.354f)
                verticalLineToRelative(1.146f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.146f)
                curveToRelative(-1.444f, -0.431f, -2.5f, -1.772f, -2.5f, -3.354f)
                close()
                moveTo(19.5f, 4.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.225f, 0.5f, 0.5f)
                verticalLineToRelative(0.909f)
                lineToRelative(-7.0f, 7.5f)
                verticalLineToRelative(3.2f)
                lineToRelative(-2.0f, -1.025f)
                verticalLineToRelative(-2.175f)
                lineToRelative(-7.0f, -7.5f)
                verticalLineToRelative(-0.909f)
                curveToRelative(0.0f, -0.275f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.475f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.475f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(2.091f)
                lineToRelative(7.0f, 7.5f)
                verticalLineToRelative(2.825f)
                lineToRelative(8.0f, 4.104f)
                verticalLineToRelative(-6.929f)
                lineToRelative(7.0f, -7.5f)
                verticalLineToRelative(-2.091f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _funnelDollar!!
    }

private var _funnelDollar: ImageVector? = null

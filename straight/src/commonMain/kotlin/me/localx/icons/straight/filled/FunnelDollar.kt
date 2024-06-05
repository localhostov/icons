package me.localx.icons.straight.filled

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

public val Icons.Filled.FunnelDollar: ImageVector
    get() {
        if (_funnelDollar != null) {
            return _funnelDollar!!
        }
        _funnelDollar = Builder(name = "FunnelDollar", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.0f)
                curveToRelative(0.0f, -0.379f, -0.271f, -0.698f, -0.645f, -0.761f)
                lineToRelative(-3.04f, -0.506f)
                curveToRelative(-1.342f, -0.224f, -2.315f, -1.374f, -2.315f, -2.733f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.379f, 0.271f, 0.698f, 0.645f, 0.761f)
                lineToRelative(3.04f, 0.506f)
                curveToRelative(1.342f, 0.224f, 2.315f, 1.374f, 2.315f, 2.733f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(20.0f, 3.0f)
                horizontalLineToRelative(-2.101f)
                curveToRelative(0.066f, 0.323f, 0.101f, 0.658f, 0.101f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.046f, -1.236f, 3.809f, -3.0f, 4.582f)
                verticalLineToRelative(1.418f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.418f)
                curveToRelative(-1.764f, -0.773f, -3.0f, -2.536f, -3.0f, -4.582f)
                lineTo(6.0f, 4.0f)
                curveToRelative(0.0f, -0.342f, 0.035f, -0.677f, 0.101f, -1.0f)
                horizontalLineToRelative(-2.101f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.414f)
                lineToRelative(8.0f, 8.0f)
                verticalLineToRelative(3.823f)
                lineToRelative(6.0f, 3.866f)
                verticalLineToRelative(-7.689f)
                lineToRelative(8.0f, -8.0f)
                verticalLineToRelative(-2.414f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _funnelDollar!!
    }

private var _funnelDollar: ImageVector? = null

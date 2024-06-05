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

public val Icons.Filled.BroomBall: ImageVector
    get() {
        if (_broomBall != null) {
            return _broomBall!!
        }
        _broomBall = Builder(name = "BroomBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(14.473f, 10.941f)
                lineTo(23.707f, 1.707f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-9.234f, 9.234f)
                lineToRelative(-1.159f, -1.159f)
                curveToRelative(-0.606f, -0.606f, -1.629f, -0.441f, -2.012f, 0.327f)
                lineToRelative(-0.703f, 2.593f)
                curveToRelative(-0.54f, -0.174f, -1.101f, -0.288f, -1.685f, -0.288f)
                curveToRelative(-1.469f, 0.0f, -2.851f, 0.572f, -3.889f, 1.611f)
                curveTo(1.927f, 14.295f, 0.365f, 20.134f, 0.069f, 21.288f)
                curveToRelative(-0.192f, 0.752f, 0.02f, 1.528f, 0.567f, 2.076f)
                curveToRelative(0.414f, 0.415f, 0.96f, 0.637f, 1.526f, 0.637f)
                curveToRelative(0.182f, 0.0f, 0.366f, -0.023f, 0.549f, -0.07f)
                curveToRelative(1.153f, -0.295f, 6.991f, -1.855f, 8.677f, -3.542f)
                curveToRelative(1.039f, -1.039f, 1.611f, -2.42f, 1.611f, -3.889f)
                curveToRelative(0.0f, -0.586f, -0.115f, -1.15f, -0.291f, -1.693f)
                lineToRelative(2.586f, -0.705f)
                curveToRelative(0.767f, -0.384f, 0.933f, -1.406f, 0.327f, -2.012f)
                lineToRelative(-1.149f, -1.149f)
                close()
            }
        }
        .build()
        return _broomBall!!
    }

private var _broomBall: ImageVector? = null

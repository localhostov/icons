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

public val Icons.Filled.HeadSideHeadphones: ImageVector
    get() {
        if (_headSideHeadphones != null) {
            return _headSideHeadphones!!
        }
        _headSideHeadphones = Builder(name = "HeadSideHeadphones", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.0f, 9.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(23.277f, 11.142f)
                curveToRelative(-1.181f, -2.706f, -2.295f, -5.262f, -3.477f, -6.723f)
                curveTo(17.882f, 1.858f, 15.075f, 0.313f, 12.0f, 0.042f)
                verticalLineToRelative(7.085f)
                curveToRelative(1.724f, 0.445f, 3.0f, 2.013f, 3.0f, 3.874f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.861f, 1.276f, -3.429f, 3.0f, -3.874f)
                lineTo(10.0f, 0.044f)
                curveToRelative(-0.182f, 0.016f, -0.364f, 0.037f, -0.547f, 0.062f)
                curveTo(4.457f, 0.793f, 0.501f, 4.946f, 0.046f, 9.983f)
                curveToRelative(-0.265f, 2.935f, 0.622f, 5.792f, 2.497f, 8.046f)
                curveToRelative(0.295f, 0.353f, 0.457f, 0.801f, 0.457f, 1.262f)
                verticalLineToRelative(4.709f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.247f)
                curveToRelative(1.5f, 0.0f, 2.778f, -1.121f, 2.974f, -2.606f)
                lineToRelative(0.449f, -3.394f)
                horizontalLineToRelative(2.33f)
                verticalLineToRelative(-2.212f)
                lineToRelative(-0.723f, -1.646f)
                close()
            }
        }
        .build()
        return _headSideHeadphones!!
    }

private var _headSideHeadphones: ImageVector? = null

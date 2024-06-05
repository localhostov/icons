package me.localx.icons.straight.outline

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

public val Icons.Outline.HeadSideHeadphones: ImageVector
    get() {
        if (_headSideHeadphones != null) {
            return _headSideHeadphones!!
        }
        _headSideHeadphones = Builder(name = "HeadSideHeadphones", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.277f, 11.142f)
                curveToRelative(-1.181f, -2.706f, -2.295f, -5.262f, -3.477f, -6.723f)
                curveTo(17.362f, 1.164f, 13.488f, -0.45f, 9.453f, 0.106f)
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
                moveTo(11.0f, 9.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.897f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(19.918f, 13.0f)
                lineToRelative(-0.68f, 5.132f)
                curveToRelative(-0.065f, 0.495f, -0.491f, 0.868f, -0.991f, 0.868f)
                horizontalLineToRelative(-4.247f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 22.0f)
                verticalLineToRelative(-2.709f)
                curveToRelative(0.0f, -0.928f, -0.327f, -1.831f, -0.92f, -2.542f)
                curveToRelative(-1.534f, -1.843f, -2.26f, -4.182f, -2.042f, -6.586f)
                curveToRelative(0.372f, -4.118f, 3.604f, -7.515f, 7.687f, -8.075f)
                curveToRelative(0.092f, -0.013f, 0.184f, -0.024f, 0.275f, -0.034f)
                verticalLineToRelative(5.073f)
                curveToRelative(-1.724f, 0.445f, -3.0f, 2.013f, -3.0f, 3.874f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.861f, -1.276f, -3.429f, -3.0f, -3.874f)
                lineTo(12.0f, 2.052f)
                curveToRelative(2.444f, 0.268f, 4.674f, 1.528f, 6.223f, 3.595f)
                curveToRelative(1.034f, 1.279f, 2.146f, 3.829f, 3.222f, 6.294f)
                lineToRelative(0.464f, 1.059f)
                horizontalLineToRelative(-1.99f)
                close()
            }
        }
        .build()
        return _headSideHeadphones!!
    }

private var _headSideHeadphones: ImageVector? = null

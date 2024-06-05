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

public val Icons.Outline.RankingStar: ImageVector
    get() {
        if (_rankingStar != null) {
            return _rankingStar!!
        }
        _rankingStar = Builder(name = "RankingStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 16.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.171f, 0.0f, -0.338f, 0.017f, -0.5f, 0.05f)
                verticalLineToRelative(-4.55f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(1.55f)
                curveToRelative(-0.162f, -0.033f, -0.329f, -0.05f, -0.5f, -0.05f)
                lineTo(2.5f, 13.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(9.0f, 11.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-10.5f)
                close()
                moveTo(2.0f, 15.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(22.0f, 22.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(10.213f, 4.847f)
                lineToRelative(-2.212f, -1.231f)
                verticalLineToRelative(-0.615f)
                horizontalLineToRelative(2.899f)
                lineToRelative(0.784f, -3.0f)
                horizontalLineToRelative(0.648f)
                lineToRelative(0.784f, 3.0f)
                horizontalLineToRelative(2.883f)
                verticalLineToRelative(0.611f)
                lineToRelative(-2.197f, 1.273f)
                lineToRelative(0.884f, 2.686f)
                lineToRelative(-0.504f, 0.349f)
                lineToRelative(-2.173f, -1.68f)
                lineToRelative(-2.183f, 1.687f)
                lineToRelative(-0.48f, -0.362f)
                lineToRelative(0.869f, -2.717f)
                close()
            }
        }
        .build()
        return _rankingStar!!
    }

private var _rankingStar: ImageVector? = null

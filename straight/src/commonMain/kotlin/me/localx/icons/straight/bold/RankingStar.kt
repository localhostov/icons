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

public val Icons.Bold.RankingStar: ImageVector
    get() {
        if (_rankingStar != null) {
            return _rankingStar!!
        }
        _rankingStar = Builder(name = "RankingStar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 16.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 13.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(10.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(3.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
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

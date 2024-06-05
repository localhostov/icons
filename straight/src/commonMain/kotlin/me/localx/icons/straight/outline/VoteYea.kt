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

public val Icons.Outline.VoteYea: ImageVector
    get() {
        if (_voteYea != null) {
            return _voteYea!!
        }
        _voteYea = Builder(name = "VoteYea", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(20.0f, 5.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                lineTo(7.0f, 2.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(7.0f)
                lineTo(24.0f, 22.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(6.0f, 5.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(11.0f)
                lineTo(6.0f, 16.0f)
                lineTo(6.0f, 5.0f)
                close()
                moveTo(22.0f, 20.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                lineTo(20.0f, 18.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(15.52f, 6.91f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.94f, 3.94f)
                curveToRelative(-0.47f, 0.47f, -1.1f, 0.73f, -1.77f, 0.73f)
                reflectiveCurveToRelative(-1.3f, -0.26f, -1.77f, -0.73f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.94f, 1.94f)
                curveToRelative(0.13f, 0.13f, 0.28f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.23f, -0.02f, 0.35f, -0.15f)
                lineToRelative(3.94f, -3.94f)
                close()
            }
        }
        .build()
        return _voteYea!!
    }

private var _voteYea: ImageVector? = null

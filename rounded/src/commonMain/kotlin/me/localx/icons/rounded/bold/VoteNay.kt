package me.localx.icons.rounded.bold

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

public val Icons.Bold.VoteNay: ImageVector
    get() {
        if (_voteNay != null) {
            return _voteNay!!
        }
        _voteNay = Builder(name = "VoteNay", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 13.13f)
                lineTo(21.0f, 7.5f)
                curveToRelative(0.0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-3.03f, 0.0f, -5.5f, 2.47f, -5.5f, 5.5f)
                verticalLineToRelative(5.63f)
                curveToRelative(-1.72f, 0.45f, -3.0f, 2.01f, -3.0f, 3.87f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                lineTo(20.0f, 22.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.86f, -1.28f, -3.43f, -3.0f, -3.87f)
                close()
                moveTo(6.0f, 7.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(9.5f)
                lineTo(6.0f, 17.0f)
                lineTo(6.0f, 7.5f)
                close()
                moveTo(8.44f, 12.44f)
                lineToRelative(1.44f, -1.44f)
                lineToRelative(-1.44f, -1.44f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f)
                curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0.0f)
                lineToRelative(1.44f, 1.44f)
                lineToRelative(1.44f, -1.44f)
                curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0.0f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0.0f, 2.12f)
                lineToRelative(-1.44f, 1.44f)
                lineToRelative(1.44f, 1.44f)
                curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0.0f, 2.12f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                lineToRelative(-1.44f, -1.44f)
                lineToRelative(-1.44f, 1.44f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0.0f, -2.12f)
                close()
            }
        }
        .build()
        return _voteNay!!
    }

private var _voteNay: ImageVector? = null

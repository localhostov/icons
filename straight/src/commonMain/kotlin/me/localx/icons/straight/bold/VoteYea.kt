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

public val Icons.Bold.VoteYea: ImageVector
    get() {
        if (_voteYea != null) {
            return _voteYea!!
        }
        _voteYea = Builder(name = "VoteYea", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 13.04f)
                lineTo(21.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(6.5f, 2.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7.54f)
                curveToRelative(-1.69f, 0.24f, -3.0f, 1.7f, -3.0f, 3.46f)
                verticalLineToRelative(5.5f)
                lineTo(24.0f, 22.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.76f, -1.31f, -3.22f, -3.0f, -3.46f)
                close()
                moveTo(6.0f, 5.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                lineTo(6.0f, 17.0f)
                lineTo(6.0f, 5.5f)
                close()
                moveTo(15.17f, 7.56f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-3.94f, 3.94f)
                curveToRelative(-0.58f, 0.58f, -1.35f, 0.88f, -2.12f, 0.88f)
                reflectiveCurveToRelative(-1.54f, -0.29f, -2.12f, -0.88f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.94f, 1.94f)
                lineToRelative(3.94f, -3.94f)
                close()
            }
        }
        .build()
        return _voteYea!!
    }

private var _voteYea: ImageVector? = null

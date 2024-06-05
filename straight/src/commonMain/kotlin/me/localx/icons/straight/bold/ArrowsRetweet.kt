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

public val Icons.Bold.ArrowsRetweet: ImageVector
    get() {
        if (_arrowsRetweet != null) {
            return _arrowsRetweet!!
        }
        _arrowsRetweet = Builder(name = "ArrowsRetweet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.85f, 15.72f)
                lineToRelative(-3.51f, 3.51f)
                curveToRelative(-0.49f, 0.49f, -1.14f, 0.76f, -1.84f, 0.76f)
                reflectiveCurveToRelative(-1.35f, -0.27f, -1.84f, -0.76f)
                lineToRelative(-3.48f, -3.48f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.7f, 1.7f)
                lineTo(17.0f, 7.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(7.84f)
                lineToRelative(1.73f, -1.73f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(7.5f, 17.0f)
                curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-7.84f)
                lineToRelative(1.7f, 1.7f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-3.48f, -3.48f)
                curveToRelative(-0.98f, -0.98f, -2.7f, -0.98f, -3.68f, 0.0f)
                lineTo(0.15f, 8.28f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.73f, -1.73f)
                verticalLineToRelative(7.84f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(7.0f)
                lineToRelative(-3.0f, -3.0f)
                lineTo(7.5f, 17.01f)
                close()
            }
        }
        .build()
        return _arrowsRetweet!!
    }

private var _arrowsRetweet: ImageVector? = null

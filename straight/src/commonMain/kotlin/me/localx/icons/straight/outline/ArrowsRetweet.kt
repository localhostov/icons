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

public val Icons.Outline.ArrowsRetweet: ImageVector
    get() {
        if (_arrowsRetweet != null) {
            return _arrowsRetweet!!
        }
        _arrowsRetweet = Builder(name = "ArrowsRetweet", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 15.87f)
                lineToRelative(-3.51f, 3.51f)
                curveToRelative(-0.4f, 0.4f, -0.92f, 0.62f, -1.49f, 0.62f)
                reflectiveCurveToRelative(-1.09f, -0.22f, -1.49f, -0.62f)
                lineToRelative(-3.48f, -3.48f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.55f, 2.55f)
                lineTo(17.99f, 7.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.3f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(8.3f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(10.04f)
                lineToRelative(2.59f, -2.59f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(7.0f, 18.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(6.0f, 6.96f)
                lineToRelative(2.55f, 2.55f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.48f, -3.48f)
                curveToRelative(-0.79f, -0.79f, -2.18f, -0.79f, -2.97f, 0.0f)
                lineTo(0.0f, 8.13f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.59f, -2.59f)
                verticalLineToRelative(10.04f)
                curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f)
                lineTo(15.3f, 19.99f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(7.0f, 17.99f)
                close()
            }
        }
        .build()
        return _arrowsRetweet!!
    }

private var _arrowsRetweet: ImageVector? = null

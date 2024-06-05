package me.localx.icons.rounded.outline

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
                moveTo(23.68f, 16.73f)
                lineToRelative(-2.59f, 2.41f)
                curveToRelative(-0.54f, 0.54f, -1.3f, 0.85f, -2.1f, 0.85f)
                reflectiveCurveToRelative(-1.55f, -0.31f, -2.12f, -0.88f)
                lineToRelative(-2.56f, -2.39f)
                curveToRelative(-0.4f, -0.38f, -0.43f, -1.01f, -0.05f, -1.41f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.42f, 1.41f, -0.05f)
                lineToRelative(2.32f, 2.16f)
                lineTo(17.99f, 9.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                verticalLineToRelative(8.43f)
                lineToRelative(2.32f, -2.16f)
                curveToRelative(0.4f, -0.38f, 1.04f, -0.35f, 1.41f, 0.05f)
                curveToRelative(0.38f, 0.4f, 0.35f, 1.04f, -0.05f, 1.41f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(6.0f, 6.57f)
                lineToRelative(2.32f, 2.16f)
                curveToRelative(0.19f, 0.18f, 0.44f, 0.27f, 0.68f, 0.27f)
                curveToRelative(0.27f, 0.0f, 0.53f, -0.11f, 0.73f, -0.32f)
                curveToRelative(0.38f, -0.4f, 0.35f, -1.04f, -0.05f, -1.41f)
                lineToRelative(-2.56f, -2.39f)
                curveToRelative(-1.13f, -1.13f, -3.13f, -1.11f, -4.22f, -0.02f)
                lineTo(0.32f, 7.27f)
                curveToRelative(-0.4f, 0.38f, -0.43f, 1.01f, -0.05f, 1.41f)
                curveToRelative(0.38f, 0.41f, 1.01f, 0.43f, 1.41f, 0.05f)
                lineToRelative(2.32f, -2.16f)
                lineTo(4.0f, 15.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _arrowsRetweet!!
    }

private var _arrowsRetweet: ImageVector? = null

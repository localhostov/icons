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

public val Icons.Bold.StarCommentAlt: ImageVector
    get() {
        if (_starCommentAlt != null) {
            return _starCommentAlt!!
        }
        _starCommentAlt = Builder(name = "StarCommentAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.96f, 15.0f)
                lineToRelative(-0.72f, -0.54f)
                lineToRelative(1.08f, -3.69f)
                lineToRelative(-2.82f, -1.85f)
                verticalLineToRelative(-0.92f)
                horizontalLineToRelative(3.85f)
                lineToRelative(1.18f, -4.0f)
                horizontalLineToRelative(0.97f)
                lineToRelative(1.18f, 4.0f)
                horizontalLineToRelative(3.83f)
                verticalLineToRelative(0.92f)
                lineToRelative(-2.8f, 1.91f)
                lineToRelative(1.17f, 3.65f)
                lineToRelative(-0.75f, 0.52f)
                lineToRelative(-3.1f, -2.14f)
                lineToRelative(-3.05f, 2.14f)
                close()
                moveTo(13.62f, 23.07f)
                lineToRelative(3.71f, -3.07f)
                horizontalLineToRelative(6.67f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                lineTo(0.0f, 20.0f)
                lineTo(6.74f, 20.0f)
                lineToRelative(3.6f, 3.03f)
                curveToRelative(0.48f, 0.43f, 1.08f, 0.64f, 1.67f, 0.64f)
                reflectiveCurveToRelative(1.16f, -0.2f, 1.61f, -0.6f)
                close()
                moveTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-4.75f)
                lineToRelative(-4.25f, 3.51f)
                lineToRelative(-4.17f, -3.51f)
                lineTo(3.0f, 17.0f)
                lineTo(3.0f, 3.5f)
                close()
            }
        }
        .build()
        return _starCommentAlt!!
    }

private var _starCommentAlt: ImageVector? = null

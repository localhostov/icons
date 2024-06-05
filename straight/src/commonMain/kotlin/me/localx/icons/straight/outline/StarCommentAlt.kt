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

public val Icons.Outline.StarCommentAlt: ImageVector
    get() {
        if (_starCommentAlt != null) {
            return _starCommentAlt!!
        }
        _starCommentAlt = Builder(name = "StarCommentAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.01f, 23.67f)
                curveToRelative(-0.48f, 0.0f, -0.96f, -0.17f, -1.34f, -0.51f)
                lineToRelative(-3.75f, -3.16f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0.0f, 1.35f, 1.35f, 0.0f, 3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                lineTo(24.0f, 20.0f)
                horizontalLineToRelative(-6.85f)
                lineToRelative(-3.85f, 3.18f)
                curveToRelative(-0.36f, 0.32f, -0.83f, 0.49f, -1.29f, 0.49f)
                close()
                moveTo(2.0f, 18.0f)
                lineTo(7.65f, 18.0f)
                lineToRelative(4.33f, 3.64f)
                lineToRelative(4.45f, -3.64f)
                horizontalLineToRelative(5.57f)
                lineTo(22.0f, 3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(15.0f)
                close()
                moveTo(12.02f, 12.86f)
                lineToRelative(3.26f, 2.52f)
                lineToRelative(0.75f, -0.52f)
                lineToRelative(-1.33f, -4.03f)
                lineToRelative(3.3f, -1.91f)
                verticalLineToRelative(-0.92f)
                horizontalLineToRelative(-4.33f)
                lineToRelative(-1.18f, -4.5f)
                horizontalLineToRelative(-0.97f)
                lineToRelative(-1.18f, 4.5f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(0.92f)
                lineToRelative(3.32f, 1.85f)
                lineToRelative(-1.3f, 4.08f)
                lineToRelative(0.72f, 0.54f)
                lineToRelative(3.27f, -2.53f)
                close()
            }
        }
        .build()
        return _starCommentAlt!!
    }

private var _starCommentAlt: ImageVector? = null

package me.localx.icons.rounded.filled

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

public val Icons.Filled.BriefcaseArrowRight: ImageVector
    get() {
        if (_briefcaseArrowRight != null) {
            return _briefcaseArrowRight!!
        }
        _briefcaseArrowRight = Builder(name = "BriefcaseArrowRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                horizontalLineToRelative(-1.1f)
                curveToRelative(-0.46f, -2.28f, -2.48f, -4.0f, -4.9f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.41f, 0.0f, -4.43f, 1.72f, -4.9f, 4.0f)
                horizontalLineToRelative(-1.1f)
                curveTo(2.24f, 4.0f, 0.0f, 6.24f, 0.0f, 9.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                lineTo(24.0f, 9.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.3f, 0.0f, 2.4f, 0.84f, 2.82f, 2.0f)
                horizontalLineToRelative(-7.63f)
                curveToRelative(0.41f, -1.16f, 1.51f, -2.0f, 2.82f, -2.0f)
                close()
                moveTo(17.12f, 16.12f)
                lineToRelative(-2.39f, 2.56f)
                curveToRelative(-0.2f, 0.21f, -0.46f, 0.32f, -0.73f, 0.32f)
                curveToRelative(-0.24f, 0.0f, -0.49f, -0.09f, -0.68f, -0.27f)
                curveToRelative(-0.4f, -0.38f, -0.43f, -1.01f, -0.05f, -1.41f)
                lineToRelative(2.16f, -2.32f)
                lineTo(7.0f, 15.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                lineTo(15.43f, 13.0f)
                lineToRelative(-2.16f, -2.32f)
                curveToRelative(-0.38f, -0.4f, -0.35f, -1.04f, 0.05f, -1.41f)
                curveToRelative(0.4f, -0.38f, 1.04f, -0.35f, 1.41f, 0.05f)
                lineToRelative(2.41f, 2.59f)
                curveToRelative(0.54f, 0.54f, 0.85f, 1.3f, 0.85f, 2.1f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.12f)
                close()
            }
        }
        .build()
        return _briefcaseArrowRight!!
    }

private var _briefcaseArrowRight: ImageVector? = null

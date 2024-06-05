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

public val Icons.Outline.BriefcaseBlank: ImageVector
    get() {
        if (_briefcaseBlank != null) {
            return _briefcaseBlank!!
        }
        _briefcaseBlank = Builder(name = "BriefcaseBlank", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveToRelative(1.3f, 0.0f, 2.42f, 0.84f, 2.83f, 2.0f)
                horizontalLineToRelative(-7.66f)
                curveToRelative(0.41f, -1.16f, 1.52f, -2.0f, 2.83f, -2.0f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                lineTo(2.0f, 9.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _briefcaseBlank!!
    }

private var _briefcaseBlank: ImageVector? = null

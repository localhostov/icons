package me.localx.icons.straight.filled

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
                moveTo(21.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 2.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                lineTo(8.0f, 0.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(8.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 4.0f)
                lineTo(8.0f, 2.0f)
                close()
                moveTo(17.41f, 15.41f)
                lineToRelative(-4.24f, 4.24f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.24f, -3.24f)
                lineTo(6.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                lineTo(15.0f, 13.0f)
                lineToRelative(-3.24f, -3.24f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(4.24f, 4.24f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f)
                close()
            }
        }
        .build()
        return _briefcaseArrowRight!!
    }

private var _briefcaseArrowRight: ImageVector? = null

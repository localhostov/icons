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

public val Icons.Bold.ArtificialIntelligence: ImageVector
    get() {
        if (_artificialIntelligence != null) {
            return _artificialIntelligence!!
        }
        _artificialIntelligence = Builder(name = "ArtificialIntelligence", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(19.5f, 9.0f)
                lineToRelative(1.5f, -3.0f)
                lineToRelative(3.0f, -1.5f)
                lineToRelative(-3.0f, -1.5f)
                lineToRelative(-1.5f, -3.0f)
                lineToRelative(-1.5f, 3.0f)
                lineToRelative(-3.0f, 1.5f)
                lineToRelative(3.0f, 1.5f)
                lineToRelative(1.5f, 3.0f)
                close()
                moveTo(12.065f, 7.098f)
                lineToRelative(2.935f, 11.902f)
                horizontalLineToRelative(-3.079f)
                lineToRelative(-0.499f, -2.0f)
                horizontalLineToRelative(-3.844f)
                lineToRelative(-0.499f, 2.0f)
                horizontalLineToRelative(-3.079f)
                lineToRelative(2.952f, -11.975f)
                curveToRelative(0.174f, -0.751f, 0.669f, -1.385f, 1.357f, -1.737f)
                curveToRelative(0.703f, -0.36f, 1.506f, -0.383f, 2.26f, -0.067f)
                curveToRelative(0.736f, 0.308f, 1.295f, 1.01f, 1.496f, 1.876f)
                close()
                moveTo(10.996f, 14.0f)
                lineToRelative(-1.496f, -6.0f)
                lineToRelative(-1.496f, 6.0f)
                horizontalLineToRelative(2.992f)
                close()
                moveTo(21.0f, 11.0f)
                verticalLineToRelative(10.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.5f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(9.5f)
                lineTo(13.0f, 0.0f)
                lineTo(3.5f, 0.0f)
                curveTo(1.57f, 0.0f, 0.0f, 1.57f, 0.0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _artificialIntelligence!!
    }

private var _artificialIntelligence: ImageVector? = null

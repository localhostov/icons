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

public val Icons.Outline.ArtificialIntelligence: ImageVector
    get() {
        if (_artificialIntelligence != null) {
            return _artificialIntelligence!!
        }
        _artificialIntelligence = Builder(name = "ArtificialIntelligence", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(19.75f, 8.5f)
                lineToRelative(1.417f, -2.833f)
                lineToRelative(2.833f, -1.417f)
                lineToRelative(-2.833f, -1.417f)
                lineTo(19.75f, 0.0f)
                lineToRelative(-1.417f, 2.833f)
                lineToRelative(-2.833f, 1.417f)
                lineToRelative(2.833f, 1.417f)
                lineToRelative(1.417f, 2.833f)
                close()
                moveTo(11.58f, 6.717f)
                lineToRelative(3.42f, 12.283f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(-0.847f, -3.0f)
                horizontalLineToRelative(-5.206f)
                lineToRelative(-0.847f, 3.0f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(3.439f, -12.362f)
                curveToRelative(0.141f, -0.608f, 0.541f, -1.12f, 1.098f, -1.405f)
                curveToRelative(0.568f, -0.292f, 1.22f, -0.31f, 1.839f, -0.05f)
                curveToRelative(0.587f, 0.246f, 1.037f, 0.817f, 1.204f, 1.535f)
                close()
                moveTo(11.538f, 14.0f)
                lineToRelative(-1.929f, -6.835f)
                curveToRelative(-0.029f, -0.114f, -0.191f, -0.114f, -0.219f, 0.0f)
                lineToRelative(-1.929f, 6.835f)
                horizontalLineToRelative(4.077f)
                close()
                moveTo(21.999f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(11.0f)
                lineTo(14.0f, 0.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.345f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(13.0f)
                close()
            }
        }
        .build()
        return _artificialIntelligence!!
    }

private var _artificialIntelligence: ImageVector? = null

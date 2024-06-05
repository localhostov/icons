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

public val Icons.Filled.ArtificialIntelligence: ImageVector
    get() {
        if (_artificialIntelligence != null) {
            return _artificialIntelligence!!
        }
        _artificialIntelligence = Builder(name = "ArtificialIntelligence", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.137f, 4.25f)
                lineToRelative(-2.925f, 1.463f)
                lineToRelative(-1.462f, 2.927f)
                lineToRelative(-1.462f, -2.927f)
                lineToRelative(-2.925f, -1.463f)
                lineToRelative(2.925f, -1.463f)
                lineToRelative(1.462f, -2.927f)
                lineToRelative(1.462f, 2.927f)
                lineToRelative(2.925f, 1.463f)
                close()
                moveTo(9.39f, 7.165f)
                lineToRelative(-1.929f, 6.835f)
                horizontalLineToRelative(4.077f)
                lineToRelative(-1.929f, -6.835f)
                curveToRelative(-0.029f, -0.114f, -0.191f, -0.114f, -0.219f, 0.0f)
                close()
                moveTo(20.0f, 10.5f)
                curveToRelative(-3.59f, 0.0f, -6.5f, -2.91f, -6.5f, -6.5f)
                curveToRelative(0.0f, -1.51f, 0.52f, -2.896f, 1.384f, -4.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(-14.884f)
                curveToRelative(-1.104f, 0.864f, -2.49f, 1.384f, -4.0f, 1.384f)
                close()
                moveTo(12.95f, 19.0f)
                lineToRelative(-0.847f, -3.0f)
                horizontalLineToRelative(-5.206f)
                lineToRelative(-0.847f, 3.0f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(3.439f, -12.362f)
                curveToRelative(0.141f, -0.608f, 0.541f, -1.12f, 1.098f, -1.405f)
                curveToRelative(0.568f, -0.292f, 1.22f, -0.31f, 1.839f, -0.05f)
                curveToRelative(0.587f, 0.246f, 1.037f, 0.817f, 1.204f, 1.535f)
                lineToRelative(3.42f, 12.283f)
                horizontalLineToRelative(-2.05f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(26.5f, 0.0f)
                horizontalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                close()
            }
        }
        .build()
        return _artificialIntelligence!!
    }

private var _artificialIntelligence: ImageVector? = null

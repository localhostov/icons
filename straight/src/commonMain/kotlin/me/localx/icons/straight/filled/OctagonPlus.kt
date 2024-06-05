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

public val Icons.Filled.OctagonPlus: ImageVector
    get() {
        if (_octagonPlus != null) {
            return _octagonPlus!!
        }
        _octagonPlus = Builder(name = "OctagonPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.121f, 6.151f)
                lineTo(17.849f, 0.879f)
                curveToRelative(-0.567f, -0.567f, -1.32f, -0.879f, -2.121f, -0.879f)
                horizontalLineToRelative(-7.456f)
                curveToRelative(-0.801f, 0.0f, -1.554f, 0.312f, -2.121f, 0.879f)
                lineTo(0.879f, 6.151f)
                curveToRelative(-0.567f, 0.567f, -0.879f, 1.32f, -0.879f, 2.121f)
                verticalLineToRelative(7.456f)
                curveToRelative(0.0f, 0.801f, 0.312f, 1.554f, 0.879f, 2.121f)
                lineToRelative(5.272f, 5.272f)
                curveToRelative(0.567f, 0.567f, 1.32f, 0.879f, 2.121f, 0.879f)
                horizontalLineToRelative(7.456f)
                curveToRelative(0.801f, 0.0f, 1.554f, -0.312f, 2.121f, -0.879f)
                lineToRelative(5.272f, -5.272f)
                curveToRelative(0.567f, -0.567f, 0.879f, -1.32f, 0.879f, -2.121f)
                verticalLineToRelative(-7.456f)
                curveToRelative(0.0f, -0.801f, -0.312f, -1.554f, -0.879f, -2.121f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _octagonPlus!!
    }

private var _octagonPlus: ImageVector? = null

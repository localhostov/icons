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

public val Icons.Outline.TirePressureWarning: ImageVector
    get() {
        if (_tirePressureWarning != null) {
            return _tirePressureWarning!!
        }
        _tirePressureWarning = Builder(name = "TirePressureWarning", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.0f)
                lineTo(11.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 12.0f)
                close()
                moveTo(24.0f, 12.429f)
                arcToRelative(12.063f, 12.063f, 0.0f, false, false, -2.638f, -7.613f)
                arcTo(6.069f, 6.069f, 0.0f, false, true, 20.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                curveToRelative(-2.3f, 0.255f, -0.16f, 5.038f, 0.8f, 6.064f)
                arcTo(9.42f, 9.42f, 0.0f, false, true, 17.715f, 20.0f)
                lineTo(6.287f, 20.0f)
                arcTo(9.426f, 9.426f, 0.0f, false, true, 4.2f, 6.064f)
                curveTo(5.155f, 5.048f, 7.306f, 0.252f, 5.0f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 1.0f)
                arcTo(6.069f, 6.069f, 0.0f, false, true, 2.638f, 4.816f)
                arcTo(11.412f, 11.412f, 0.0f, false, false, 5.0f, 21.544f)
                lineTo(5.0f, 23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(7.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(11.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(15.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(19.0f, 21.544f)
                arcTo(11.3f, 11.3f, 0.0f, false, false, 24.0f, 12.429f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _tirePressureWarning!!
    }

private var _tirePressureWarning: ImageVector? = null

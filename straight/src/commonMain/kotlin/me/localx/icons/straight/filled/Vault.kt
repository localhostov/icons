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

public val Icons.Filled.Vault: ImageVector
    get() {
        if (_vault != null) {
            return _vault!!
        }
        _vault = Builder(name = "Vault", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.86f)
                curveToRelative(-0.45f, 1.72f, -2.0f, 3.0f, -3.86f, 3.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f)
                curveToRelative(1.86f, 0.0f, 3.41f, 1.28f, 3.86f, 3.0f)
                horizontalLineToRelative(-2.86f)
                close()
                moveTo(24.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 16.0f)
                verticalLineToRelative(-7.0f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f)
                lineTo(24.0f, 22.0f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _vault!!
    }

private var _vault: ImageVector? = null

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

public val Icons.Filled.SuitcaseAlt: ImageVector
    get() {
        if (_suitcaseAlt != null) {
            return _suitcaseAlt!!
        }
        _suitcaseAlt = Builder(name = "SuitcaseAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(18.0f, 2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(8.0f, 0.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                lineTo(0.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                lineTo(6.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(8.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 24.0f)
                horizontalLineToRelative(6.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(8.0f, 4.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 4.0f)
                close()
            }
        }
        .build()
        return _suitcaseAlt!!
    }

private var _suitcaseAlt: ImageVector? = null

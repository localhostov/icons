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

public val Icons.Filled.FirstMedal: ImageVector
    get() {
        if (_firstMedal != null) {
            return _firstMedal!!
        }
        _firstMedal = Builder(name = "FirstMedal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.0f)
                curveToRelative(-4.962f, 0.0f, -9.0f, 4.037f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.038f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                reflectiveCurveToRelative(-4.038f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.614f)
                lineToRelative(-0.78f, 0.809f)
                lineToRelative(-1.439f, -1.389f)
                lineToRelative(2.708f, -2.806f)
                horizontalLineToRelative(1.512f)
                verticalLineToRelative(10.0f)
                close()
                moveTo(12.998f, 4.046f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(7.867f)
                lineToRelative(-3.42f, 6.912f)
                curveToRelative(-1.731f, -1.595f, -3.973f, -2.643f, -6.449f, -2.867f)
                close()
                moveTo(4.474f, 6.985f)
                lineTo(1.028f, 0.0f)
                horizontalLineToRelative(7.972f)
                lineToRelative(1.996f, 4.046f)
                curveToRelative(-2.512f, 0.228f, -4.782f, 1.304f, -6.522f, 2.939f)
                close()
            }
        }
        .build()
        return _firstMedal!!
    }

private var _firstMedal: ImageVector? = null

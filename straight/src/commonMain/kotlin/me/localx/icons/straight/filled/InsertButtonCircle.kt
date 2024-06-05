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

public val Icons.Filled.InsertButtonCircle: ImageVector
    get() {
        if (_insertButtonCircle != null) {
            return _insertButtonCircle!!
        }
        _insertButtonCircle = Builder(name = "InsertButtonCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.915f, 13.0f)
                horizontalLineToRelative(4.17f)
                lineToRelative(-2.085f, 3.177f)
                lineToRelative(-2.085f, -3.177f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.383f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                close()
                moveTo(6.5f, 9.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.5f, 7.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.789f, 11.0f)
                lineTo(6.211f, 11.0f)
                lineToRelative(5.789f, 8.823f)
                lineToRelative(5.789f, -8.823f)
                close()
            }
        }
        .build()
        return _insertButtonCircle!!
    }

private var _insertButtonCircle: ImageVector? = null

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

public val Icons.Filled.DumbbellWeightlifting: ImageVector
    get() {
        if (_dumbbellWeightlifting != null) {
            return _dumbbellWeightlifting!!
        }
        _dumbbellWeightlifting = Builder(name = "DumbbellWeightlifting", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(23.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 2.0f)
                lineTo(3.0f, 0.0f)
                lineTo(1.0f, 0.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(0.974f)
                lineToRelative(5.026f, 7.311f)
                verticalLineToRelative(12.689f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-12.689f)
                lineToRelative(5.026f, -7.311f)
                horizontalLineToRelative(0.974f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(13.474f, 10.0f)
                horizontalLineToRelative(-2.947f)
                lineToRelative(-4.125f, -6.0f)
                horizontalLineToRelative(11.197f)
                lineToRelative(-4.125f, 6.0f)
                close()
                moveTo(10.0f, 7.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _dumbbellWeightlifting!!
    }

private var _dumbbellWeightlifting: ImageVector? = null

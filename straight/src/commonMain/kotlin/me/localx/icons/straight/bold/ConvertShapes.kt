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

public val Icons.Bold.ConvertShapes: ImageVector
    get() {
        if (_convertShapes != null) {
            return _convertShapes!!
        }
        _convertShapes = Builder(name = "ConvertShapes", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.0f, 1.273f)
                verticalLineToRelative(5.727f)
                lineToRelative(-2.683f, -2.683f)
                curveToRelative(-2.703f, 1.651f, -4.317f, 4.517f, -4.317f, 7.683f)
                lineTo(0.0f, 12.0f)
                curveToRelative(0.0f, -3.979f, 1.928f, -7.588f, 5.165f, -9.835f)
                lineTo(3.0f, 0.0f)
                horizontalLineToRelative(5.727f)
                curveTo(9.43f, 0.0f, 10.0f, 0.57f, 10.0f, 1.273f)
                close()
                moveTo(24.0f, 12.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, 3.167f, -1.614f, 6.033f, -4.317f, 7.683f)
                lineToRelative(-2.683f, -2.683f)
                verticalLineToRelative(5.727f)
                curveToRelative(0.0f, 0.703f, 0.57f, 1.273f, 1.273f, 1.273f)
                horizontalLineToRelative(5.727f)
                lineToRelative(-2.167f, -2.167f)
                curveToRelative(3.195f, -2.229f, 5.167f, -5.915f, 5.167f, -9.834f)
                close()
                moveTo(0.0f, 14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(10.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-10.0f)
                close()
                moveTo(3.0f, 21.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                lineTo(3.0f, 17.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(13.0f, 5.5f)
                curveToRelative(0.0f, -3.032f, 2.468f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.468f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.468f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -2.468f, -5.5f, -5.5f)
                close()
                moveTo(16.0f, 5.5f)
                curveToRelative(0.0f, 1.379f, 1.121f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _convertShapes!!
    }

private var _convertShapes: ImageVector? = null

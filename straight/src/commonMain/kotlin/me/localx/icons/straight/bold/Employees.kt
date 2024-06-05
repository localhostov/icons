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

public val Icons.Bold.Employees: ImageVector
    get() {
        if (_employees != null) {
            return _employees!!
        }
        _employees = Builder(name = "Employees", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.5f, 8.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.791f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.791f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.791f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                reflectiveCurveTo(14.209f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(-4.0f, 1.791f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.791f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(6.5f, 16.0f)
                curveToRelative(2.209f, 0.0f, 4.0f, -1.791f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.791f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.791f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.791f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(19.5f, 17.0f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.157f, 0.0f, -2.202f, 0.451f, -3.0f, 1.17f)
                curveToRelative(-0.798f, -0.72f, -1.843f, -1.17f, -3.0f, -1.17f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.783f, 0.605f, -1.42f, 1.37f, -1.487f)
                lineToRelative(2.39f, 2.987f)
                lineToRelative(2.388f, -2.985f)
                curveToRelative(0.757f, 0.075f, 1.352f, 0.708f, 1.352f, 1.485f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.783f, 0.605f, -1.42f, 1.37f, -1.487f)
                lineToRelative(2.39f, 2.987f)
                lineToRelative(2.388f, -2.985f)
                curveToRelative(0.757f, 0.075f, 1.352f, 0.708f, 1.352f, 1.485f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -2.481f, -2.019f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }
        .build()
        return _employees!!
    }

private var _employees: ImageVector? = null

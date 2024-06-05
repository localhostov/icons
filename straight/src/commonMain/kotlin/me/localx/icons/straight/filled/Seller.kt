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

public val Icons.Filled.Seller: ImageVector
    get() {
        if (_seller != null) {
            return _seller!!
        }
        _seller = Builder(name = "Seller", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.667f, 15.667f)
                verticalLineToRelative(0.333f)
                curveToRelative(0.0f, 1.105f, -0.831f, 2.0f, -1.857f, 2.0f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-1.026f, 0.0f, -1.857f, -0.895f, -1.857f, -2.0f)
                verticalLineToRelative(-0.333f)
                reflectiveCurveToRelative(0.0f, 0.333f, 0.0f, 0.333f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 1.105f, -0.831f, 2.0f, -1.857f, 2.0f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-1.026f, 0.0f, -1.857f, -0.895f, -1.857f, -2.0f)
                lineToRelative(1.238f, -3.0f)
                horizontalLineToRelative(10.524f)
                lineToRelative(1.238f, 3.0f)
                curveToRelative(0.0f, 1.105f, -0.831f, 2.0f, -1.857f, 2.0f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-1.026f, 0.0f, -1.857f, -0.895f, -1.857f, -2.0f)
                horizontalLineToRelative(0.0f)
                moveToRelative(-4.667f, -10.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
                moveTo(22.144f, 20.0f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-0.673f, 0.0f, -1.306f, -0.18f, -1.856f, -0.495f)
                curveToRelative(-0.552f, 0.315f, -1.185f, 0.495f, -1.857f, 0.495f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-0.673f, 0.0f, -1.306f, -0.18f, -1.857f, -0.495f)
                curveToRelative(-0.551f, 0.315f, -1.184f, 0.495f, -1.856f, 0.495f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-0.296f, 0.0f, -0.581f, -0.042f, -0.857f, -0.108f)
                verticalLineToRelative(4.108f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-4.108f)
                curveToRelative(-0.277f, 0.066f, -0.562f, 0.108f, -0.857f, 0.108f)
                close()
                moveTo(9.001f, 16.0f)
                verticalLineToRelative(-0.396f)
                lineToRelative(0.662f, -1.604f)
                horizontalLineToRelative(-4.662f)
                curveToRelative(-2.761f, 0.0f, -5.0f, 2.239f, -5.0f, 5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-5.338f)
                curveToRelative(-0.615f, -0.709f, -1.0f, -1.636f, -1.0f, -2.662f)
                close()
            }
        }
        .build()
        return _seller!!
    }

private var _seller: ImageVector? = null

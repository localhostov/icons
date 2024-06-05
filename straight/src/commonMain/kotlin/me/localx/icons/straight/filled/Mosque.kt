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

public val Icons.Filled.Mosque: ImageVector
    get() {
        if (_mosque != null) {
            return _mosque!!
        }
        _mosque = Builder(name = "Mosque", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(15.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-15.0f)
                close()
                moveTo(10.58f, 12.966f)
                lineToRelative(10.796f, 0.034f)
                curveToRelative(1.61f, -1.221f, 2.624f, -2.925f, 2.624f, -4.419f)
                curveToRelative(0.0f, -3.824f, -3.985f, -5.181f, -6.329f, -6.478f)
                curveToRelative(0.0f, 0.0f, -0.671f, -0.298f, -0.671f, -2.104f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.849f, -0.723f, 2.134f, -0.723f, 2.134f)
                curveToRelative(-2.351f, 1.288f, -6.277f, 2.653f, -6.277f, 6.448f)
                curveToRelative(0.0f, 1.479f, 0.996f, 3.168f, 2.58f, 4.385f)
                close()
                moveTo(3.0f, 0.0f)
                reflectiveCurveTo(0.0f, 2.5f, 0.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                curveTo(6.0f, 2.5f, 3.0f, 0.0f, 3.0f, 0.0f)
                close()
                moveTo(8.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-9.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _mosque!!
    }

private var _mosque: ImageVector? = null

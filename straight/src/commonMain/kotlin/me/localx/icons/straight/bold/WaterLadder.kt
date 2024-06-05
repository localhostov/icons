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

public val Icons.Bold.WaterLadder: ImageVector
    get() {
        if (_waterLadder != null) {
            return _waterLadder!!
        }
        _waterLadder = Builder(name = "WaterLadder", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(-1.157f, 0.0f, -2.202f, -0.451f, -3.0f, -1.17f)
                curveToRelative(-0.798f, 0.72f, -1.843f, 1.17f, -3.0f, 1.17f)
                reflectiveCurveToRelative(-2.202f, -0.451f, -3.0f, -1.17f)
                curveToRelative(-0.798f, 0.72f, -1.843f, 1.17f, -3.0f, 1.17f)
                reflectiveCurveToRelative(-2.202f, -0.451f, -3.0f, -1.17f)
                curveToRelative(-0.798f, 0.72f, -1.843f, 1.17f, -3.0f, 1.17f)
                reflectiveCurveToRelative(-2.202f, -0.451f, -3.0f, -1.17f)
                curveToRelative(-0.798f, 0.72f, -1.843f, 1.17f, -3.0f, 1.17f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.651f, 0.0f, 1.201f, -0.419f, 1.408f, -1.0f)
                horizontalLineToRelative(3.184f)
                curveToRelative(0.207f, 0.581f, 0.757f, 1.0f, 1.408f, 1.0f)
                reflectiveCurveToRelative(1.201f, -0.419f, 1.408f, -1.0f)
                horizontalLineToRelative(3.184f)
                curveToRelative(0.207f, 0.581f, 0.757f, 1.0f, 1.408f, 1.0f)
                reflectiveCurveToRelative(1.201f, -0.419f, 1.408f, -1.0f)
                horizontalLineToRelative(3.184f)
                curveToRelative(0.207f, 0.581f, 0.757f, 1.0f, 1.408f, 1.0f)
                reflectiveCurveToRelative(1.201f, -0.419f, 1.408f, -1.0f)
                horizontalLineToRelative(3.184f)
                curveToRelative(0.207f, 0.581f, 0.757f, 1.0f, 1.408f, 1.0f)
                close()
                moveTo(7.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(4.0f, 4.5f)
                curveTo(4.0f, 2.019f, 6.019f, 0.0f, 8.5f, 0.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(7.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                lineTo(7.0f, 9.0f)
                close()
            }
        }
        .build()
        return _waterLadder!!
    }

private var _waterLadder: ImageVector? = null

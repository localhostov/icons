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

public val Icons.Bold.FaceViewfinder: ImageVector
    get() {
        if (_faceViewfinder != null) {
            return _faceViewfinder!!
        }
        _faceViewfinder = Builder(name = "FaceViewfinder", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 24.0f)
                lineTo(2.5f, 24.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(24.0f, 21.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                close()
                moveTo(24.0f, 2.5f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(24.0f, 2.5f)
                close()
                moveTo(3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                lineTo(8.0f, 0.0f)
                lineTo(2.5f, 0.0f)
                curveTo(1.121f, 0.0f, 0.0f, 1.122f, 0.0f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(3.0f)
                lineTo(3.0f, 3.0f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(0.0f, 3.866f, -3.134f, 7.0f, -7.0f, 7.0f)
                reflectiveCurveToRelative(-7.0f, -3.134f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.134f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.134f, 7.0f, 7.0f)
                close()
                moveTo(9.5f, 12.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(15.555f, 14.832f)
                lineToRelative(-1.109f, -1.664f)
                curveToRelative(-0.013f, 0.008f, -1.28f, 0.832f, -2.445f, 0.832f)
                curveToRelative(-0.971f, 0.0f, -2.096f, -0.602f, -2.447f, -0.833f)
                lineToRelative(-1.107f, 1.666f)
                curveToRelative(0.18f, 0.12f, 1.803f, 1.168f, 3.555f, 1.168f)
                reflectiveCurveToRelative(3.375f, -1.048f, 3.555f, -1.168f)
                close()
                moveTo(16.0f, 10.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _faceViewfinder!!
    }

private var _faceViewfinder: ImageVector? = null

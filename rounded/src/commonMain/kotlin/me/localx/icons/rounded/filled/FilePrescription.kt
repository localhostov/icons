package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.FilePrescription: ImageVector
    get() {
        if (_filePrescription != null) {
            return _filePrescription!!
        }
        _filePrescription = Builder(name = "FilePrescription", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.0f, 7.0f)
                lineTo(14.0f, 0.46f)
                curveToRelative(0.913f, 0.346f, 1.753f, 0.879f, 2.465f, 1.59f)
                lineToRelative(3.484f, 3.486f)
                curveToRelative(0.712f, 0.711f, 1.245f, 1.551f, 1.591f, 2.464f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                close()
                moveTo(21.977f, 10.0f)
                horizontalLineToRelative(-6.976f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(12.001f, 0.024f)
                curveToRelative(-0.161f, -0.011f, -0.322f, -0.024f, -0.485f, -0.024f)
                horizontalLineToRelative(-4.515f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.515f)
                curveToRelative(0.0f, -0.163f, -0.013f, -0.324f, -0.024f, -0.485f)
                close()
                moveTo(13.814f, 20.419f)
                curveToRelative(0.321f, 0.449f, 0.217f, 1.074f, -0.233f, 1.395f)
                curveToRelative(-0.176f, 0.125f, -0.379f, 0.186f, -0.58f, 0.186f)
                curveToRelative(-0.312f, 0.0f, -0.62f, -0.146f, -0.815f, -0.419f)
                lineToRelative(-0.972f, -1.36f)
                lineToRelative(-0.972f, 1.36f)
                curveToRelative(-0.195f, 0.273f, -0.503f, 0.419f, -0.815f, 0.419f)
                curveToRelative(-0.201f, 0.0f, -0.404f, -0.061f, -0.58f, -0.186f)
                curveToRelative(-0.45f, -0.321f, -0.554f, -0.946f, -0.233f, -1.395f)
                lineToRelative(1.371f, -1.919f)
                lineToRelative(-2.5f, -3.5f)
                horizontalLineToRelative(-1.485f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.063f, -0.559f, 1.993f, -1.395f, 2.526f)
                lineToRelative(1.61f, 2.254f)
                lineToRelative(0.972f, -1.36f)
                curveToRelative(0.321f, -0.451f, 0.946f, -0.553f, 1.395f, -0.233f)
                curveToRelative(0.45f, 0.321f, 0.554f, 0.946f, 0.233f, 1.395f)
                lineToRelative(-1.371f, 1.919f)
                lineToRelative(1.371f, 1.919f)
                close()
            }
        }
        .build()
        return _filePrescription!!
    }

private var _filePrescription: ImageVector? = null

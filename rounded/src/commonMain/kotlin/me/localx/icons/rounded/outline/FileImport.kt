package me.localx.icons.rounded.outline

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

public val Icons.Outline.FileImport: ImageVector
    get() {
        if (_fileImport != null) {
            return _fileImport!!
        }
        _fileImport = Builder(name = "FileImport", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.949f, 5.536f)
                lineToRelative(-3.484f, -3.486f)
                curveToRelative(-1.323f, -1.322f, -3.081f, -2.05f, -4.95f, -2.05f)
                horizontalLineToRelative(-4.515f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(0.163f, 0.0f, 0.325f, 0.008f, 0.485f, 0.023f)
                verticalLineToRelative(4.977f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.977f)
                curveToRelative(0.015f, 0.16f, 0.023f, 0.322f, 0.023f, 0.485f)
                verticalLineToRelative(8.515f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(7.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.515f)
                curveToRelative(0.0f, -1.871f, -0.729f, -3.628f, -2.051f, -4.95f)
                close()
                moveTo(15.0f, 8.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                lineTo(14.0f, 2.659f)
                curveToRelative(0.38f, 0.218f, 0.733f, 0.487f, 1.051f, 0.805f)
                lineToRelative(3.484f, 3.486f)
                curveToRelative(0.318f, 0.317f, 0.587f, 0.67f, 0.805f, 1.05f)
                horizontalLineToRelative(-4.341f)
                close()
                moveTo(10.398f, 16.0f)
                lineTo(1.0f, 16.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(9.398f)
                lineToRelative(-1.293f, -1.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.024f, 0.0f, -1.414f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(1.613f, 1.614f)
                curveToRelative(1.154f, 1.154f, 1.154f, 3.032f, 0.0f, 4.187f)
                lineToRelative(-1.613f, 1.614f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.39f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(1.293f, -1.293f)
                close()
            }
        }
        .build()
        return _fileImport!!
    }

private var _fileImport: ImageVector? = null

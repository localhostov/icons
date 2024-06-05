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

public val Icons.Filled.TablePivot: ImageVector
    get() {
        if (_tablePivot != null) {
            return _tablePivot!!
        }
        _tablePivot = Builder(name = "TablePivot", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.101f, 6.0f)
                curveToRelative(0.399f, -1.956f, 1.943f, -3.501f, 3.899f, -3.899f)
                verticalLineToRelative(3.899f)
                lineTo(0.101f, 6.0f)
                close()
                moveTo(4.0f, 8.0f)
                lineTo(0.0f, 8.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.414f, 1.721f, 4.435f, 4.0f, 4.899f)
                lineTo(4.0f, 8.0f)
                close()
                moveTo(6.0f, 6.0f)
                lineTo(23.899f, 6.0f)
                curveToRelative(-0.465f, -2.279f, -2.485f, -4.0f, -4.899f, -4.0f)
                lineTo(6.0f, 2.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(24.0f, 8.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                lineTo(6.0f, 22.0f)
                lineTo(6.0f, 8.0f)
                lineTo(24.0f, 8.0f)
                close()
                moveTo(21.707f, 11.752f)
                lineToRelative(-1.075f, -1.076f)
                curveToRelative(-0.871f, -0.871f, -2.391f, -0.871f, -3.263f, 0.0f)
                lineToRelative(-1.076f, 1.076f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                reflectiveCurveToRelative(1.024f, 0.391f, 1.414f, 0.0f)
                lineToRelative(0.293f, -0.293f)
                verticalLineToRelative(2.127f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.127f)
                lineToRelative(0.293f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.024f, -0.391f, -1.414f, 0.0f)
                lineToRelative(-1.075f, 1.076f)
                curveToRelative(-0.436f, 0.435f, -0.676f, 1.015f, -0.676f, 1.631f)
                reflectiveCurveToRelative(0.24f, 1.196f, 0.676f, 1.631f)
                lineToRelative(1.076f, 1.076f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(-0.293f, -0.293f)
                horizontalLineToRelative(2.127f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-2.127f)
                lineToRelative(0.293f, 0.293f)
                curveToRelative(0.195f, 0.195f, 0.451f, 0.293f, 0.707f, 0.293f)
                reflectiveCurveToRelative(0.512f, -0.098f, 0.707f, -0.293f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
            }
        }
        .build()
        return _tablePivot!!
    }

private var _tablePivot: ImageVector? = null

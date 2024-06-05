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

public val Icons.Filled.FilesMedical: ImageVector
    get() {
        if (_filesMedical != null) {
            return _filesMedical!!
        }
        _filesMedical = Builder(name = "FilesMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.0f, 21.0f)
                curveToRelative(0.2f, 0.0f, 0.392f, -0.013f, 0.592f, -0.03f)
                curveToRelative(-0.789f, 1.836f, -2.594f, 3.027f, -4.592f, 3.03f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-2.76f, -0.003f, -4.997f, -2.24f, -5.0f, -5.0f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.003f, -1.998f, 1.194f, -3.803f, 3.03f, -4.592f)
                curveToRelative(-0.017f, 0.192f, -0.03f, 0.392f, -0.03f, 0.592f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.004f, 3.864f, 3.136f, 6.996f, 7.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(17.0f, 4.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.966f)
                curveToRelative(-0.074f, -0.649f, -0.359f, -1.256f, -0.811f, -1.728f)
                lineToRelative(-2.284f, -2.359f)
                curveToRelative(-0.5f, -0.506f, -1.162f, -0.82f, -1.871f, -0.884f)
                verticalLineToRelative(3.971f)
                close()
                moveTo(22.0f, 7.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(-0.003f, 2.76f, -2.24f, 4.997f, -5.0f, 5.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.76f, -0.003f, -4.997f, -2.24f, -5.0f, -5.0f)
                lineTo(7.0f, 5.0f)
                curveToRelative(0.003f, -2.76f, 2.24f, -4.997f, 5.0f, -5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(18.0f, 12.5f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _filesMedical!!
    }

private var _filesMedical: ImageVector? = null

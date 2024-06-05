package me.localx.icons.straight.outline

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

public val Icons.Outline.CustomizeComputer: ImageVector
    get() {
        if (_customizeComputer != null) {
            return _customizeComputer!!
        }
        _customizeComputer = Builder(name = "CustomizeComputer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 8.24f)
                lineToRelative(2.0f, -2.0f)
                verticalLineToRelative(13.76f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.0f)
                lineTo(6.5f, 24.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 20.0f)
                lineTo(0.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(13.039f)
                lineToRelative(-1.79f, 2.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-9.76f)
                close()
                moveTo(12.0f, 10.0f)
                curveToRelative(-4.0f, 0.0f, -5.0f, 6.0f, -5.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(14.619f, 8.76f)
                lineToRelative(5.738f, -6.449f)
                curveToRelative(0.348f, -0.389f, 0.946f, -0.422f, 1.334f, -0.074f)
                curveToRelative(0.013f, 0.012f, 0.025f, 0.023f, 0.038f, 0.036f)
                curveToRelative(0.369f, 0.368f, 0.369f, 0.965f, 0.001f, 1.334f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, -0.001f, 0.001f)
                lineToRelative(-6.042f, 6.043f)
                curveToRelative(0.465f, 0.511f, 0.817f, 1.118f, 1.039f, 1.788f)
                lineToRelative(6.413f, -6.413f)
                curveToRelative(1.148f, -1.15f, 1.148f, -3.013f, 0.0f, -4.163f)
                curveToRelative(-1.149f, -1.15f, -3.012f, -1.151f, -4.162f, -0.002f)
                curveToRelative(-0.039f, 0.039f, -0.077f, 0.079f, -0.114f, 0.12f)
                lineToRelative(-6.298f, 7.076f)
                curveToRelative(0.747f, 0.086f, 1.443f, 0.325f, 2.054f, 0.703f)
                close()
            }
        }
        .build()
        return _customizeComputer!!
    }

private var _customizeComputer: ImageVector? = null

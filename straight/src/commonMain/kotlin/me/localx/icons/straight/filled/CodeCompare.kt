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

public val Icons.Filled.CodeCompare: ImageVector
    get() {
        if (_codeCompare != null) {
            return _codeCompare!!
        }
        _codeCompare = Builder(name = "CodeCompare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.858f, 1.28f, 3.411f, 3.0f, 3.858f)
                verticalLineToRelative(8.142f)
                curveToRelative(0.0f, 0.551f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.996f)
                lineToRelative(2.203f, -2.203f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-3.256f, 3.256f)
                curveToRelative(-0.774f, 0.775f, -0.774f, 2.037f, 0.0f, 2.812f)
                lineToRelative(3.256f, 3.256f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.304f, -2.293f)
                horizontalLineToRelative(5.097f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(21.0f, 8.858f)
                curveToRelative(1.72f, -0.447f, 3.0f, -2.0f, 3.0f, -3.858f)
                close()
                moveTo(10.162f, 9.662f)
                lineToRelative(3.256f, -3.255f)
                curveToRelative(0.775f, -0.775f, 0.775f, -2.037f, 0.0f, -2.812f)
                lineTo(10.162f, 0.338f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.259f, 2.248f)
                lineTo(6.0f, 4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                lineTo(3.0f, 15.142f)
                curveToRelative(-1.72f, 0.447f, -3.0f, 2.0f, -3.0f, 3.858f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.858f, -1.28f, -3.411f, -3.0f, -3.858f)
                lineTo(5.0f, 7.0f)
                curveToRelative(0.0f, -0.551f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.995f)
                lineToRelative(-2.248f, 2.248f)
                lineToRelative(1.414f, 1.414f)
                close()
            }
        }
        .build()
        return _codeCompare!!
    }

private var _codeCompare: ImageVector? = null

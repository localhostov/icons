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

public val Icons.Filled.FlaskGear: ImageVector
    get() {
        if (_flaskGear != null) {
            return _flaskGear!!
        }
        _flaskGear = Builder(name = "FlaskGear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 18.0f)
                curveToRelative(0.0f, -0.46f, -0.089f, -0.895f, -0.218f, -1.313f)
                lineToRelative(1.416f, -0.816f)
                lineToRelative(-0.998f, -1.733f)
                lineToRelative(-1.411f, 0.813f)
                curveToRelative(-0.605f, -0.652f, -1.393f, -1.125f, -2.289f, -1.33f)
                verticalLineToRelative(-1.621f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.621f)
                curveToRelative(-0.896f, 0.205f, -1.685f, 0.678f, -2.289f, 1.33f)
                lineToRelative(-1.411f, -0.813f)
                lineToRelative(-0.998f, 1.733f)
                lineToRelative(1.416f, 0.816f)
                curveToRelative(-0.129f, 0.418f, -0.218f, 0.853f, -0.218f, 1.313f)
                reflectiveCurveToRelative(0.089f, 0.895f, 0.218f, 1.313f)
                lineToRelative(-1.416f, 0.816f)
                lineToRelative(0.998f, 1.733f)
                lineToRelative(1.411f, -0.813f)
                curveToRelative(0.605f, 0.652f, 1.393f, 1.125f, 2.289f, 1.33f)
                verticalLineToRelative(1.621f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.621f)
                curveToRelative(0.896f, -0.205f, 1.685f, -0.678f, 2.289f, -1.33f)
                lineToRelative(1.411f, 0.813f)
                lineToRelative(0.998f, -1.733f)
                lineToRelative(-1.416f, -0.816f)
                curveToRelative(0.129f, -0.418f, 0.218f, -0.853f, 0.218f, -1.313f)
                close()
                moveTo(18.0f, 19.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(7.0f, 9.04f)
                lineTo(7.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(5.0f, 0.0f)
                horizontalLineToRelative(12.0f)
                lineTo(17.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.04f)
                curveToRelative(0.29f, 0.253f, 0.731f, 0.652f, 1.251f, 1.158f)
                curveToRelative(-2.581f, 0.576f, -4.69f, 2.397f, -5.664f, 4.802f)
                lineTo(1.758f, 15.0f)
                curveToRelative(1.746f, -2.728f, 4.296f, -5.131f, 5.242f, -5.96f)
                close()
                moveTo(12.721f, 24.0f)
                lineTo(3.044f, 24.0f)
                curveToRelative(-0.117f, -0.042f, -3.044f, -1.108f, -3.044f, -4.143f)
                curveToRelative(0.0f, -0.951f, 0.258f, -1.884f, 0.678f, -2.857f)
                lineTo(10.069f, 17.0f)
                curveToRelative(-0.041f, 0.328f, -0.069f, 0.661f, -0.069f, 1.0f)
                curveToRelative(0.0f, 2.393f, 1.056f, 4.534f, 2.721f, 6.0f)
                close()
            }
        }
        .build()
        return _flaskGear!!
    }

private var _flaskGear: ImageVector? = null

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

public val Icons.Outline.Racquet: ImageVector
    get() {
        if (_racquet != null) {
            return _racquet!!
        }
        _racquet = Builder(name = "Racquet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.932f, 2.078f)
                arcTo(7.455f, 7.455f, 0.0f, false, false, 15.74f, 0.05f)
                arcTo(10.865f, 10.865f, 0.0f, false, false, 9.267f, 3.259f)
                arcToRelative(10.523f, 10.523f, 0.0f, false, false, -3.223f, 7.934f)
                reflectiveCurveToRelative(0.073f, 0.812f, 0.141f, 1.144f)
                curveToRelative(0.15f, 1.571f, 0.131f, 3.943f, -0.883f, 4.957f)
                lineToRelative(-5.25f, 5.25f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(5.25f, -5.25f)
                curveToRelative(1.025f, -1.024f, 3.434f, -1.033f, 5.0f, -0.878f)
                arcToRelative(10.937f, 10.937f, 0.0f, false, false, 1.619f, 0.162f)
                arcToRelative(10.666f, 10.666f, 0.0f, false, false, 7.412f, -3.249f)
                curveTo(24.569f, 10.926f, 25.1f, 5.244f, 21.932f, 2.078f)
                close()
                moveTo(21.415f, 10.232f)
                lineTo(19.933f, 8.749f)
                lineToRelative(2.042f, -2.043f)
                arcTo(7.432f, 7.432f, 0.0f, false, true, 21.415f, 10.232f)
                close()
                moveTo(21.315f, 4.542f)
                lineTo(18.519f, 7.335f)
                lineTo(16.593f, 5.409f)
                lineToRelative(2.753f, -2.752f)
                arcToRelative(4.866f, 4.866f, 0.0f, false, true, 1.172f, 0.835f)
                arcTo(4.833f, 4.833f, 0.0f, false, true, 21.311f, 4.542f)
                close()
                moveTo(9.5f, 14.51f)
                arcToRelative(4.874f, 4.874f, 0.0f, false, true, -0.849f, -1.159f)
                lineToRelative(2.992f, -2.992f)
                lineToRelative(1.926f, 1.926f)
                lineTo(10.551f, 15.3f)
                arcTo(4.807f, 4.807f, 0.0f, false, true, 9.5f, 14.51f)
                close()
                moveTo(8.743f, 7.458f)
                lineToRelative(1.486f, 1.487f)
                lineTo(8.047f, 11.127f)
                arcTo(7.949f, 7.949f, 0.0f, false, true, 8.743f, 7.458f)
                close()
                moveTo(13.058f, 8.945f)
                lineTo(15.179f, 6.823f)
                lineTo(17.105f, 8.749f)
                lineTo(14.983f, 10.871f)
                close()
                moveTo(15.948f, 2.045f)
                arcTo(6.772f, 6.772f, 0.0f, false, true, 16.681f, 2.0f)
                curveToRelative(0.156f, 0.0f, 0.3f, 0.028f, 0.453f, 0.039f)
                lineTo(15.179f, 4.0f)
                lineToRelative(-1.4f, -1.4f)
                arcTo(7.985f, 7.985f, 0.0f, false, true, 15.948f, 2.04f)
                close()
                moveTo(11.955f, 3.6f)
                lineToRelative(1.81f, 1.809f)
                lineTo(11.644f, 7.531f)
                lineTo(9.8f, 5.689f)
                arcTo(9.557f, 9.557f, 0.0f, false, true, 11.955f, 3.6f)
                close()
                moveTo(13.046f, 15.99f)
                curveToRelative(-0.079f, -0.014f, -0.185f, -0.032f, -0.3f, -0.05f)
                lineTo(14.983f, 13.7f)
                lineToRelative(1.569f, 1.568f)
                arcTo(7.684f, 7.684f, 0.0f, false, true, 13.046f, 15.99f)
                close()
                moveTo(18.321f, 14.208f)
                lineTo(16.4f, 12.285f)
                lineToRelative(2.122f, -2.122f)
                lineToRelative(1.891f, 1.891f)
                arcToRelative(9.536f, 9.536f, 0.0f, false, true, -2.089f, 2.154f)
                close()
            }
        }
        .build()
        return _racquet!!
    }

private var _racquet: ImageVector? = null

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

public val Icons.Outline.FileUser: ImageVector
    get() {
        if (_fileUser != null) {
            return _fileUser!!
        }
        _fileUser = Builder(name = "FileUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 10.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(19.949f, 5.536f)
                lineToRelative(-3.484f, -3.486f)
                curveToRelative(-1.323f, -1.322f, -3.081f, -2.05f, -4.95f, -2.05f)
                horizontalLineToRelative(-4.515f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-8.515f)
                curveToRelative(0.0f, -1.871f, -0.729f, -3.628f, -2.051f, -4.95f)
                close()
                moveTo(18.535f, 6.951f)
                curveToRelative(0.318f, 0.317f, 0.587f, 0.67f, 0.805f, 1.05f)
                horizontalLineToRelative(-4.341f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                lineTo(13.999f, 2.659f)
                curveToRelative(0.38f, 0.218f, 0.733f, 0.487f, 1.051f, 0.805f)
                lineToRelative(3.484f, 3.486f)
                close()
                moveTo(9.172f, 22.001f)
                curveToRelative(0.413f, -1.164f, 1.524f, -2.0f, 2.828f, -2.0f)
                reflectiveCurveToRelative(2.415f, 0.836f, 2.828f, 2.0f)
                horizontalLineToRelative(-5.656f)
                close()
                moveTo(20.0f, 19.001f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-0.101f)
                curveToRelative(-0.465f, -2.279f, -2.485f, -4.0f, -4.899f, -4.0f)
                reflectiveCurveToRelative(-4.435f, 1.721f, -4.899f, 4.0f)
                horizontalLineToRelative(-0.101f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(4.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(4.515f)
                curveToRelative(0.163f, 0.0f, 0.325f, 0.008f, 0.485f, 0.023f)
                verticalLineToRelative(4.977f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.977f)
                curveToRelative(0.015f, 0.16f, 0.023f, 0.322f, 0.023f, 0.485f)
                verticalLineToRelative(8.515f)
                close()
            }
        }
        .build()
        return _fileUser!!
    }

private var _fileUser: ImageVector? = null

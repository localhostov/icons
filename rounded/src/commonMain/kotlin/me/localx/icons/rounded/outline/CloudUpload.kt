package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.CloudUpload: ImageVector
    get() {
        if (_cloudUpload != null) {
            return _cloudUpload!!
        }
        _cloudUpload = Builder(name = "CloudUpload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.4f, 7.379f)
                arcToRelative(1.128f, 1.128f, 0.0f, false, true, -0.769f, -0.754f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.1f, 5.237f)
                arcTo(1.046f, 1.046f, 0.0f, false, true, 2.223f, 13.1f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 0.057f, 18.3f)
                arcTo(5.622f, 5.622f, 0.0f, false, false, 5.683f, 23.0f)
                horizontalLineTo(11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(5.683f)
                arcToRelative(3.614f, 3.614f, 0.0f, false, true, -3.646f, -2.981f)
                arcToRelative(3.456f, 3.456f, 0.0f, false, true, 1.376f, -3.313f)
                arcTo(3.021f, 3.021f, 0.0f, false, false, 4.4f, 11.141f)
                arcToRelative(6.113f, 6.113f, 0.0f, false, true, -0.073f, -4.126f)
                arcTo(5.956f, 5.956f, 0.0f, false, true, 9.215f, 3.05f)
                arcTo(6.109f, 6.109f, 0.0f, false, true, 9.987f, 3.0f)
                arcToRelative(5.984f, 5.984f, 0.0f, false, true, 5.756f, 4.28f)
                arcToRelative(2.977f, 2.977f, 0.0f, false, false, 2.01f, 1.99f)
                arcToRelative(5.934f, 5.934f, 0.0f, false, true, 0.778f, 11.09f)
                arcToRelative(0.976f, 0.976f, 0.0f, false, false, -0.531f, 0.888f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, false, 1.388f, 0.915f)
                curveToRelative(4.134f, -1.987f, 6.38f, -7.214f, 2.88f, -12.264f)
                arcTo(6.935f, 6.935f, 0.0f, false, false, 18.4f, 7.379f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.707f, 16.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.414f)
                lineToRelative(-1.586f, -1.586f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -4.242f, 0.0f)
                lineToRelative(-1.586f, 1.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 1.414f)
                lineTo(14.0f, 15.414f)
                verticalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(15.414f)
                lineToRelative(1.293f, 1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.414f, 0.0f)
                close()
            }
        }
        .build()
        return _cloudUpload!!
    }

private var _cloudUpload: ImageVector? = null

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

public val Icons.Outline.DeleteRight: ImageVector
    get() {
        if (_deleteRight != null) {
            return _deleteRight!!
        }
        _deleteRight = Builder(name = "DeleteRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.794f, 11.393f)
                lineToRelative(-5.381f, -7.037f)
                curveToRelative(-1.127f, -1.475f, -2.909f, -2.356f, -4.767f, -2.356f)
                lineTo(5.0f, 2.0f)
                curveTo(2.243f, 2.0f, 0.0f, 4.243f, 0.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(8.646f)
                curveToRelative(1.857f, 0.0f, 3.64f, -0.881f, 4.766f, -2.355f)
                lineToRelative(5.382f, -7.037f)
                curveToRelative(0.274f, -0.358f, 0.274f, -0.856f, 0.0f, -1.215f)
                close()
                moveTo(16.823f, 18.431f)
                curveToRelative(-0.751f, 0.983f, -1.938f, 1.57f, -3.177f, 1.57f)
                lineTo(5.0f, 20.001f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(8.646f)
                curveToRelative(1.238f, 0.0f, 2.426f, 0.587f, 3.178f, 1.57f)
                lineToRelative(4.917f, 6.43f)
                lineToRelative(-4.918f, 6.43f)
                close()
                moveTo(13.707f, 9.708f)
                lineToRelative(-2.293f, 2.293f)
                lineToRelative(2.293f, 2.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.293f, -2.293f)
                lineToRelative(-2.293f, 2.293f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.293f, -2.293f)
                lineToRelative(-2.293f, -2.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.293f, 2.293f)
                lineToRelative(2.293f, -2.293f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _deleteRight!!
    }

private var _deleteRight: ImageVector? = null

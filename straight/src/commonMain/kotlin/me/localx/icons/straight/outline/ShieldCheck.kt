package me.localx.icons.straight.outline

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
import me.localx.icons.straight.Icons

public val Icons.Outline.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.948f, 24.009f)
                lineToRelative(-0.354f, -0.157f)
                curveTo(11.2f, 23.679f, 2.0f, 19.524f, 2.0f, 12.0f)
                verticalLineTo(5.476f)
                arcTo(2.983f, 2.983f, 0.0f, false, true, 4.051f, 2.644f)
                lineTo(12.0f, 0.009f)
                lineToRelative(7.949f, 2.635f)
                arcTo(2.983f, 2.983f, 0.0f, false, true, 22.0f, 5.476f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 8.577f, -9.288f, 11.755f, -9.684f, 11.887f)
                close()
                moveTo(12.0f, 2.106f)
                lineTo(4.684f, 4.532f)
                arcTo(0.992f, 0.992f, 0.0f, false, false, 4.0f, 5.476f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, 5.494f, 6.44f, 9.058f, 8.047f, 9.861f)
                curveTo(13.651f, 21.216f, 20.0f, 18.263f, 20.0f, 12.0f)
                verticalLineTo(5.476f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, false, -0.684f, -0.944f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.111f, 14.542f)
                horizontalLineToRelative(-0.033f)
                arcToRelative(1.872f, 1.872f, 0.0f, false, true, -1.345f, -0.6f)
                lineToRelative(-2.306f, -2.4f)
                lineTo(8.868f, 10.16f)
                lineTo(11.112f, 12.5f)
                lineToRelative(5.181f, -5.181f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-5.261f, 5.261f)
                arcTo(1.873f, 1.873f, 0.0f, false, true, 11.111f, 14.542f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null

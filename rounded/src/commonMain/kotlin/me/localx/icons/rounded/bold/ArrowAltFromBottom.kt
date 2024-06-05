package me.localx.icons.rounded.bold

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

public val Icons.Bold.ArrowAltFromBottom: ImageVector
    get() {
        if (_arrowAltFromBottom != null) {
            return _arrowAltFromBottom!!
        }
        _arrowAltFromBottom = Builder(name = "ArrowAltFromBottom", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 21.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(3.587f)
                curveToRelative(0.811f, 0.0f, 1.218f, -0.994f, 0.644f, -1.575f)
                lineTo(12.644f, 0.27f)
                curveToRelative(-0.356f, -0.36f, -0.932f, -0.36f, -1.288f, 0.0f)
                lineTo(6.269f, 5.425f)
                curveToRelative(-0.574f, 0.581f, -0.167f, 1.575f, 0.644f, 1.575f)
                horizontalLineToRelative(3.587f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(4.5f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _arrowAltFromBottom!!
    }

private var _arrowAltFromBottom: ImageVector? = null

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

public val Icons.Outline.Snowmobile: ImageVector
    get() {
        if (_snowmobile != null) {
            return _snowmobile!!
        }
        _snowmobile = Builder(name = "Snowmobile", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.0f, 2.5f)
                close()
                moveTo(18.519f, 19.8f)
                lineToRelative(1.1f, 2.2f)
                horizontalLineTo(20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.382f)
                lineToRelative(-1.0f, -2.0f)
                horizontalLineTo(11.816f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 24.0f)
                horizontalLineTo(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.406f, -5.634f)
                lineTo(0.0f, 15.0f)
                horizontalLineTo(2.237f)
                lineToRelative(1.4f, 3.0f)
                horizontalLineTo(5.781f)
                lineToRelative(1.227f, -2.2f)
                lineTo(3.6f, 13.819f)
                arcToRelative(2.933f, 2.933f, 0.0f, false, true, -1.445f, -1.7f)
                arcToRelative(2.983f, 2.983f, 0.0f, false, true, 0.163f, -2.29f)
                lineTo(4.365f, 6.572f)
                arcTo(2.907f, 2.907f, 0.0f, false, true, 6.051f, 5.154f)
                arcToRelative(2.983f, 2.983f, 0.0f, false, true, 2.29f, 0.163f)
                curveToRelative(0.644f, 0.322f, 5.839f, 3.146f, 6.06f, 3.266f)
                lineToRelative(-0.955f, 1.757f)
                curveToRelative(-0.866f, -0.471f, -2.119f, -1.15f, -3.261f, -1.768f)
                lineToRelative(-2.1f, 3.437f)
                lineTo(6.378f, 10.966f)
                lineTo(8.422f, 7.622f)
                curveToRelative(-0.485f, -0.26f, -0.844f, -0.451f, -0.975f, -0.516f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.342f, 0.447f)
                lineTo(4.058f, 10.807f)
                arcToRelative(1.019f, 1.019f, 0.0f, false, false, 0.5f, 1.255f)
                lineToRelative(3.405f, 2.0f)
                arcToRelative(2.016f, 2.016f, 0.0f, false, true, 0.8f, 2.7f)
                lineTo(8.07f, 18.0f)
                horizontalLineToRelative(9.072f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, false, 2.363f, -1.152f)
                lineTo(22.0f, 13.656f)
                verticalLineTo(11.607f)
                lineTo(17.744f, 8.2f)
                arcTo(8.913f, 8.913f, 0.0f, false, true, 18.0f, 10.135f)
                arcTo(4.938f, 4.938f, 0.0f, false, true, 13.032f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(2.032f)
                arcTo(2.919f, 2.919f, 0.0f, false, false, 16.0f, 10.183f)
                arcToRelative(13.551f, 13.551f, 0.0f, false, false, -1.091f, -4.249f)
                lineTo(13.468f, 4.781f)
                lineToRelative(1.249f, -1.562f)
                lineTo(24.0f, 10.646f)
                verticalLineToRelative(3.7f)
                lineToRelative(-2.918f, 3.735f)
                arcTo(4.973f, 4.973f, 0.0f, false, true, 18.519f, 19.8f)
                close()
                moveTo(9.0f, 20.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 20.0f)
                close()
            }
        }
        .build()
        return _snowmobile!!
    }

private var _snowmobile: ImageVector? = null

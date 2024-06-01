package me.localx.icons.straight.bold

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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 4.0f)
                    horizontalLineTo(18.729f)
                    lineTo(15.644f, 0.0f)
                    horizontalLineTo(8.356f)
                    lineTo(5.271f, 4.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 4.0f, 1.4413f, 4.3161f, 0.8787f, 4.8787f)
                    curveTo(0.3161f, 5.4413f, 0.0f, 6.2043f, 0.0f, 7.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(7.0f)
                    curveTo(24.0f, 6.2043f, 23.6839f, 5.4413f, 23.1213f, 4.8787f)
                    curveTo(22.5587f, 4.3161f, 21.7956f, 4.0f, 21.0f, 4.0f)
                    close()
                    moveTo(21.0f, 21.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(21.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0001f, 19.5f)
                    curveTo(13.0879f, 19.5f, 14.1513f, 19.1774f, 15.0557f, 18.5731f)
                    curveTo(15.9602f, 17.9687f, 16.6652f, 17.1098f, 17.0814f, 16.1048f)
                    curveTo(17.4977f, 15.0998f, 17.6066f, 13.9939f, 17.3944f, 12.927f)
                    curveTo(17.1822f, 11.8601f, 16.6584f, 10.8801f, 15.8892f, 10.1109f)
                    curveTo(15.12f, 9.3417f, 14.14f, 8.8179f, 13.0731f, 8.6057f)
                    curveTo(12.0062f, 8.3935f, 10.9004f, 8.5024f, 9.8954f, 8.9187f)
                    curveTo(8.8904f, 9.335f, 8.0314f, 10.0399f, 7.427f, 10.9444f)
                    curveTo(6.8227f, 11.8488f, 6.5001f, 12.9122f, 6.5001f, 14.0f)
                    curveTo(6.5017f, 15.4582f, 7.0817f, 16.8562f, 8.1128f, 17.8873f)
                    curveTo(9.1439f, 18.9184f, 10.5419f, 19.4984f, 12.0001f, 19.5f)
                    close()
                    moveTo(12.0001f, 11.5f)
                    curveTo(12.4946f, 11.5f, 12.9779f, 11.6466f, 13.389f, 11.9213f)
                    curveTo(13.8002f, 12.196f, 14.1206f, 12.5865f, 14.3098f, 13.0433f)
                    curveTo(14.499f, 13.5001f, 14.5485f, 14.0028f, 14.4521f, 14.4877f)
                    curveTo(14.3556f, 14.9727f, 14.1175f, 15.4181f, 13.7679f, 15.7678f)
                    curveTo(13.4182f, 16.1174f, 12.9728f, 16.3555f, 12.4878f, 16.452f)
                    curveTo(12.0029f, 16.5484f, 11.5002f, 16.4989f, 11.0434f, 16.3097f)
                    curveTo(10.5866f, 16.1205f, 10.1961f, 15.8001f, 9.9214f, 15.3889f)
                    curveTo(9.6467f, 14.9778f, 9.5001f, 14.4945f, 9.5001f, 14.0f)
                    curveTo(9.5001f, 13.337f, 9.7635f, 12.7011f, 10.2324f, 12.2322f)
                    curveTo(10.7012f, 11.7634f, 11.3371f, 11.5f, 12.0001f, 11.5f)
                    close()
                }
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
